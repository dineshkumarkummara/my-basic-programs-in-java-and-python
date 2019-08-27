def Remove(tuples): 
    tuples = (x for x in tuples if x) 
    return tuples 
  
# Driver Code 
tuples = [(), ('ram','15','8'), (), ('laxman', 'sita'),  
          ('krishna', 'akbar', '45'), ('',''),()] 
print (Remove(tuples) )