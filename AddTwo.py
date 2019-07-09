# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        curr = l1
        num1 = 0
        power = 1
        while curr is not None:
            num1 = curr.val*power + num1
            curr = curr.next
            power = power*10
        curr2 = l2
        num2 = 0
        power = 1
        while curr2 is not None:
            num2 = curr2.val*power + num2
            curr2 = curr2.next
            power = power*10
        num3 = num1 + num2
        l3 = ListNode(num3 % 10)
        num3 = num3 / 10
        curr3 = l3
        while num3 != 0:
            curr3.next = ListNode(num3 % 10)
            num3 = num3 / 10
            curr3 = curr3.next
        return l3