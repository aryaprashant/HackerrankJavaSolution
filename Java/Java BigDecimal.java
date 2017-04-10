 for(int i=0;i<n;i++)
        {
            BigDecimal big=new BigDecimal(s[i]);
            int id=i;
            for(int j=i+1;j<n;j++)
            {
                BigDecimal curr=new BigDecimal(s[j]);
                if(curr.compareTo(big)==1)
                {
                    big=curr;
                    id=j;
                }
            }
            String temp=s[i];
            s[i]=s[id];
            s[id]=temp;
        }