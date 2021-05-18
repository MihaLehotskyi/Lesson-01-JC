package ua.lviv.lgs;

public interface Iterator {
	public boolean HasNext();

	public Number Next();
}

class Collection {

	private static Number[] arr;

	Collection(Number[] arr) {
		Collection.arr = arr;

	}

	public class Forward implements Iterator {
		private int count = 0;

		@Override
		public boolean HasNext() {
			return count < arr.length;
		}

		@Override
		public Number Next() {
			return (arr[count++]);
		}
	}

	public Forward getForward() {
		return new Forward();
	}

	public class Backward implements Iterator {
		private int count = (arr.length - 1);

		@Override
		public boolean HasNext() {
			return count > 0;
		}

		@Override
		public Number Next() {
			if (arr.length % 2 == 0) {
				if (count % 2 == 1) {

				} else if (count % 2 == 0) {
					count--;
				}
			}
			if (arr.length % 2 == 1) {
				if (count % 2 == 0) {

				} else if (count % 2 == 1) {
					count--;
				}
			}
			return arr[count--];
		}
	}

	public Backward getBackward() {
		return new Backward();
	}

	public Iterator anonymus() {
		return new Iterator() {
			private int count = (arr.length - 1);

			@Override
			public boolean HasNext() {
				return count > 2;
			}

			@Override
			public Number Next() {
				if (arr[count].intValue() % 2 == 1) {
					if (arr.length - 1 == count) {
						System.out.println(arr[count]);
					}
					count = count - 3;
				} else
					count = count - 3;
				if (count > 0) {
					if (arr[count].intValue() % 2 == 1) {
						return arr[count];
					} else if (arr[count].intValue() % 2 == 0) {
					}
				}
				return null;
			}
		};
	}

	public Iterator each5() {
		class Each5 implements Iterator {
			int count = 0;

			@Override
			public boolean HasNext() {
				return count < arr.length;
			}

			@Override
			public Number Next() {
				if (arr[count].intValue() % 2 == 0) {
					if (count == 0) {
						System.out.println(arr[count].intValue() - 100);
					}
					count = count + 5;
				} else
					count = count + 5;
				if (count < arr.length) {
					if (arr[count].intValue() % 2 == 0) {
						return arr[count].intValue() - 100;
					} else if (arr[count].intValue() % 2 == 1) {
					}
				}
				return null;
			}
		}
		return new Each5();
	}

	private static class Converter implements Iterator {
		int count = 0;

		@Override
		public boolean HasNext() {
			return count < arr.length;
		}

		@Override
		public Number Next() {
			if (arr[count].intValue() % 2 == 0) {
				if (count == 0) {
					System.out.println(arr[count].intValue() + 1);
				}
				count = count + 2;
			} else
				count = count + 2;
			if (count < arr.length) {
				if (arr[count].intValue() % 2 == 0) {
					return arr[count].intValue() + 1;
				} else if (arr[count].intValue() % 2 == 1) {
				}
			}
			return null;
		}

	}
	public static Converter createstatic() {
		return new Converter();
	}
}
