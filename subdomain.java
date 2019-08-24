// Problem Subdomain Visit Count
// Runtime: 7 ms, faster than 98.14% of Java online submissions for Subdomain Visit Count.
// Memory Usage: 37 MB, less than 96.97% of Java online submissions for Subdomain Visit Count.

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            int firstSpaceInd = cpdomains[i].indexOf(' ');
            int num = Integer.parseInt(cpdomains[i].substring(0, firstSpaceInd));
            String domain = cpdomains[i].substring(firstSpaceInd+1, cpdomains[i].length());
            if (map.containsKey(domain)) {
                    int value = map.get(domain);
                    value = value + num;
                    map.put(domain, value);
                } else {
                    map.put(domain, num);
            }
            while (domain.indexOf('.') != -1) {
                domain = domain.substring(domain.indexOf('.') + 1);
                if (map.containsKey(domain)) {
                    int value = map.get(domain);
                    value = value + num;
                    map.put(domain, value);
                } else {
                    map.put(domain, num);
                }   
            }
        }
        List<String> lister = new ArrayList<>();
        for(Map.Entry entry:map.entrySet()){
            lister.add(entry.getValue() + " " + entry.getKey());
        }
        return lister;
    }
}