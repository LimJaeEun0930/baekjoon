-- 코드를 작성해주세요
SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS d JOIN SKILLCODES s ON ((d.SKILL_CODE & s.CODE) = s.CODE) AND S.NAME IN ('Python', 'C#')
ORDER BY ID ASC
