from instapy_cli import client
username="dinesh_kumar_pr"
password=""
image="C:/Users/dinesh kumar/Pictures/sai/day2/IMG_0366.png"
text=""
with client(username,password) as cli:
    cli.upload(image,text)
    