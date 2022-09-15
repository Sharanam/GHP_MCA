def hms_to_seconds(t):
    h,m,s = [int(i) for i in t.split(':')]
    return h*3600 + 60*m + s
print(hms_to_seconds('12 : 45: 55'))    