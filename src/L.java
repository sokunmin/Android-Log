/*  L.java

   Created by Chun-Ming Su on 8/20/15.
   Copyright (c) 2015 Chun-Ming Su. All rights reserved.
*/

package im.chunmingsu.logsample;

import android.content.Context;
import android.util.Log;

public class L {
	private static final int LEVEL = Log.VERBOSE;
    private static final String DIVIDER = "----------";

	public static String isNull(Object obj) {
		StringBuilder result = new StringBuilder()
				.append((obj == null)?"null":obj.getClass().getSimpleName()+" not null");
		return result.toString();
	}



    /**
     * Debug Level
     */

    public static void d(String tag) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(tag)
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.d(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void d(Object obj) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(obj.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.d(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void d(Context context) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.d(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void d(Class<?> cls) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(cls.getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.d(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void d(Class<?> cls, String format, Object...args) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append(cls.getSimpleName())
                                                    .append(" / ")
                                                    .append(method())
                                                    .append("] => ").toString();
                Log.d(logTag, String.format(format, args));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void d(Context context, String format, Object...args) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append(context.getClass().getSimpleName())
                                                    .append(" / ")
                                                    .append(method())
                                                    .append("] => ").toString();
                Log.d(logTag, String.format(format, args));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void d() {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append(method())
                                                    .append("] => ").toString();
                Log.d(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void d(String format, Object...args) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append(method())
                                                    .append("] => ").toString();
                Log.d(logTag, String.format(format, args));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void d(int depth, String format, Object...args) {
        if (LEVEL <= Log.DEBUG && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append("/(").append(lineNumber(depth)).append(")")
                                                    .append(method(depth))
                                                    .append("] => ").toString();
                Log.d(logTag, String.format(format, args));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Info Level
     */

    public static void i(String tag) {
        if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(tag)
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.i(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void i(Object obj) {
        if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(obj.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.i(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void i(Context context) {
        if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.i(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void i(Class<?> cls) {
        if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(cls.getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.i(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	public static void i(Class<?> cls, String format, Object...args) {
		if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(cls.getSimpleName())
                        .append(" / ")
												   .append(method())
												   .append("] => ").toString();
				Log.i(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/** print the class name &  the current method with message & line number */
	public static void i(Context context, String format, Object...args) {
		if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
												   .append("] => ").toString();
				Log.i(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/** print the current method name & line number */
	public static void i() {
		if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(method())
												   .append("] => ").toString();
				Log.i(logTag, DIVIDER);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/** print the current method with message & line number */
	public static void i(String format, Object...args) {
		if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                        .append(method())
												   .append("] => ").toString();
				Log.i(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/** print the specific method, which is assigned by depth, in the stack with message */
	public static void i(int depth, String format, Object...args) {
		if (LEVEL <= Log.INFO && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                        .append("/(").append(lineNumber(depth)).append(")")
                        .append(method(depth))
                        .append("] => ").toString();
				Log.i(logTag, String.format(format, args));
            } catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Warning Level
	 */
    public static void w(String tag) {
        if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(tag)
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.w(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void w(Object obj) {
        if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(obj.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.w(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void w(Context context) {
        if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.w(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void w(Class<?> cls) {
        if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(cls.getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.w(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	public static void w(Class<?> cls, String format, Object...args) {
		if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(cls.getSimpleName())
                                                    .append(" / ")
												   .append(method())
												   .append("] => ").toString();
				Log.w(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void w(Context context, String format, Object...args) {
		if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                                                    .append(method())
												   .append("] => ").toString();
				Log.w(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void w() {
		if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(method())
												   .append("] => ").toString();
				Log.w(logTag, DIVIDER);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void w(String format, Object...args) {
		if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                    .append(method())
												   .append("] => ").toString();
				Log.w(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void w(int depth, String format, Object...args) {
		if (LEVEL <= Log.WARN && BuildConfig.DEBUG) {
			try {
                String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                        .append("/(").append(lineNumber(depth)).append(")")
                                                    .append(method(depth))
                                                    .append("] => ").toString();
				Log.w(logTag, String.format(format, args));
            } catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Error Level
	 */

    public static void e(String tag) {
        if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(tag)
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.e(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void e(Object object) {
        if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(object.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.e(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void e(Context context) {
        if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
            try {
                String logTag = new StringBuilder().append("[(")
                        .append(lineNumber()).append(")")
                        .append(context.getClass().getSimpleName())
                        .append(" / ")
                        .append(method())
                        .append("] => ").toString();
                Log.e(logTag, DIVIDER);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	public static void e(Class<?> cls, String format, Object...args) {
		if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(cls.getSimpleName())
												   .append(" / ")
												   .append(method())
												   .append("] => ").toString();
				Log.e(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void e(Context context, String format, Object...args) {
		if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(context.getClass().getSimpleName())
												   .append(" / ")
												   .append(method())
												   .append("] => ").toString();
				Log.e(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void e() {
		if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(method())
												   .append("] => ").toString();
				Log.e(logTag, DIVIDER);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void e(String format, Object...args) {
		if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
												   .append(method())
												   .append("] => ").toString();
				Log.e(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void e(int depth, String format, Object...args) {
		if (LEVEL <= Log.ERROR && BuildConfig.DEBUG) {
			try {
				String logTag = new StringBuilder().append("[(").append(lineNumber()).append(")")
                                                   .append("/(").append(lineNumber(depth)).append(")")
												   .append(method(depth))
												   .append("] => ").toString();
				Log.e(logTag, String.format(format, args));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Private static methods
	    0 is getStackTrace(),
	    1 is getMethodName(int depth) and
	    2 is invoking method.
	 */
	private static StringBuilder method(int ...depth) {
		int i = (depth.length > 0) ? depth[0] : 0;
		final StackTraceElement[] stack = Thread.currentThread().getStackTrace();
		return new StringBuilder().append(stack[4+i].getMethodName()).append("()");
	}
	
	private static StringBuilder lineNumber(int ...depth) {
		int i = (depth.length > 0) ? depth[0] : 0;
		final StackTraceElement[] stack = Thread.currentThread().getStackTrace();
		return new StringBuilder().append(stack[4+i].getLineNumber()).append("");
	}
}
