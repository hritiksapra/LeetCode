#Greedy Algorithm implementation in Python
class Solution(object):
    def findContentChildren(self, g, s):
        num = 0
        g.sort()
        s.sort()
        try: 
            for a in s:
                if a >= g[num]:
                    num = num + 1
        except IndexError:
            print("Children Done")
        finally:
            return num
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        