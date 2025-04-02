-- 코드를 작성해주세요
select c.ID, c.GENOTYPE, p.GENOTYPE as PARENT_GENOTYPE
from ECOLI_DATA c join ECOLI_DATA p on c.PARENT_ID = p.ID and (p.GENOTYPE & c.GENOTYPE) = p.GENOTYPE
order by id asc