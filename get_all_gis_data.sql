SELECT
  *
FROM
  M176Assess
  JOIN M176TaxPar ON M176TaxPar.LOC_ID = M176Assess.LOC_ID
where SITE_ADDR='00082 GREENLEAF AV'