# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)

class TrieNode:
    def __init__(self):
        self.children = {}
        self.endOfWord = False

class WordDictionary:

    def __init__(self):
        self.root = TrieNode()


    def addWord(self, word: str) -> None:
        curr = self.root
        for c in word:
            if c not in curr.children:
                curr.children[c] = TrieNode()
            curr = curr.children[c]
        curr.endOfWord = True

    def searchUtil(self, word,  ind,  root):
        curr = root

        for i in range(ind, len(word)):
            ch = word[i]
            if ch == ".":
                for child in curr.children.values():
                    if self.searchUtil(word, i+1, child):
                        return  True
                return  False
            else :
                if ch not in curr.children:
                    return  False
                curr = curr.children[ch]
        return  curr.endOfWord



    def search(self, word: str) -> bool:
        return self.searchUtil(word,0,  self.root)
