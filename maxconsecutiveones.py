def max_consecutive_ones(nums):
    count=0
    max_count=0

    for num in nums:
        if num==1:
            count+=1
        else:
            max_count= max(max_count, count)
            count=0
    return max(max_count, count)

nums1 = [1,1,0,1,1,1]
nums2 = [1,0,1,1,0,1]

print("output 1: ", max_consecutive_ones(nums1))
print("outpu 2: ", max_consecutive_ones(nums2))