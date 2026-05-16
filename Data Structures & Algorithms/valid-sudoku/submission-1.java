class Solution {
    
    // board will be iterated and we are going to maintain 3 HashMaps as per below to find the answer
    // HashMap for rows to check validity for rows  =>  Map<Integer, HashSet<Character>>
    // HashMap for columns to check validity for columns  =>  Map<Integer, HashSet<Character>>
    // HashMap for subgrid to check validity for subgrid  =>  Map<Pair<Integer,Integer>, HashSet<Character>>
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Pair<Integer, Integer>, HashSet<Character>> subgrids = new HashMap<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char value = board[i][j];

                if(value == '.') continue;

                if(rows.computeIfAbsent(i, k -> new HashSet()).contains(value)) return false;
                if(cols.computeIfAbsent(j, k -> new HashSet()).contains(value)) return false;
                if(subgrids.computeIfAbsent(new Pair(i/3, j/3), k -> new HashSet()).contains(value)) return false;

                rows.get(i).add(value);
                cols.get(j).add(value);
                subgrids.get(new Pair(i/3, j/3)).add(value);
            }
        } 
        return true;
    }
}
