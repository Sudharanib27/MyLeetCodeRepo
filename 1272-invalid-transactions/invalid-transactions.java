class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        Map<String, List<Transaction>> transByName = new HashMap<>();

        for (String trans: transactions) {
            Transaction transaction = new Transaction(trans);
            if (transByName.containsKey(transaction.getName())) {
                transByName.get(transaction.getName()).add(transaction);
            } else {
                List<Transaction> newTransaction = new ArrayList<>();
                newTransaction.add(transaction);
                transByName.put(transaction.getName(), newTransaction);
            }
        }

        for (String trans: transactions) {
            Transaction transaction = new Transaction(trans);
            if (invalid(transByName.get(transaction.getName()), transaction)) {
                result.add(trans);
            }
        }

        return result;
    }

    private boolean invalid(List<Transaction> transactions, Transaction transaction) {
        if (transactions.size() <= 1 && !transaction.exceedAmount()) {
            return false;
        }

        for (Transaction tran: transactions) {
            if (transaction.inValidTransaction(tran.getCity(), tran.getTime())) {
                return true;
            }
        }
        return false;
    }

}

class Transaction {
    private final String name;
    private final int time;
    private final int amount;
    private final String city;

    Transaction (String transaction) {
        String[] transvalues = transaction.split(",");
        this.name = transvalues[0];
        this.time = Integer.parseInt(transvalues[1]);
        this.amount = Integer.parseInt(transvalues[2]);
        this.city = transvalues[3];
    }

        public String getName() {
            return name;
        }

        public int getTime() {
            return time;
        }

        public int getAmount() {
            return amount;
        }

        public String getCity() {
            return city;
        }

        public boolean exceedAmount() {
            return amount > 1000;
        }

        private boolean withinHourSameNameDiffCity(String city, int time) {
            return Math.abs(this.time - time) <= 60 && !this.city.equals(city);
        }

        public boolean inValidTransaction(String city, int time) {
            return exceedAmount() || withinHourSameNameDiffCity(city, time);
        }

}