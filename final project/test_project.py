from project import drawGrid

def main():
    test_drawGrid()


def test_drawGrid():
    if drawGrid(2) != 4:
        print("win")

if __name__ == "__main__":
    main()


