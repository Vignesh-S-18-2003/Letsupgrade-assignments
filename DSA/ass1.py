def rotate_array(arr, rotation_count):
    length = len(arr)
    rotation_count %= length  # Handle rotation count larger than array length
    rotated_arr = arr[length - rotation_count:] + arr[:length - rotation_count]
    return rotated_arr
