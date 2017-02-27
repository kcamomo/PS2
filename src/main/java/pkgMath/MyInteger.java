package pkgMath;



class MyInteger {

	private int iValue;

	public MyInteger(int value) {
		iValue = value;
		setiValue(value);
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
        return (iValue % 2) == 0;
	}

	public boolean isOdd() {
        return (iValue % 2) == 1;
	}

	public boolean isPrime() {
        if (iValue % 2 == 0)
            return false;
        for (int i = 3; i * i <= iValue; i += 2)
            if (iValue % i == 0) return false;
        return true;
	}

	public static boolean isEven(int n) {
        return (n % 2) == 0;
	}

	public static boolean isOdd(int n) {
        return (n % 2) == 1;
	}

	public static boolean isPrime(int n) {
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
  }  
	
	public static boolean isEven(MyInteger anyInt) {
        return anyInt.isEven();
	}
    	public static boolean isOdd(MyInteger anyInt) {
            return anyInt.isOdd();
}
    	public static boolean isPrime(MyInteger anyInt) {
            return anyInt.isPrime();
    	}
    	
        public boolean equals(int anyInt) {
            if (anyInt == iValue) 
                return true;
            else return false;
        }

        public boolean equals(MyInteger anyInt) {
            if (anyInt.iValue == this.iValue) 
                return true;
            else return false;
        }
}
