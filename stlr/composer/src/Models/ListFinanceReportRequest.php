<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class ListFinanceReportRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 银行碳账户
    /**
     * @var string
     */
    public $enterpriseNo;

    // 企业统一信用代码或者项目id
    /**
     * @var string
     */
    public $companyId;

    // 报告年，当前年，对比年
    /**
     * @var string
     */
    public $compareYear;

    // 基准年，被对比年
    /**
     * @var string
     */
    public $baseYear;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseNo'      => 'enterprise_no',
        'companyId'         => 'company_id',
        'compareYear'       => 'compare_year',
        'baseYear'          => 'base_year',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('compareYear', $this->compareYear, true);
        Model::validateRequired('baseYear', $this->baseYear, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->compareYear) {
            $res['compare_year'] = $this->compareYear;
        }
        if (null !== $this->baseYear) {
            $res['base_year'] = $this->baseYear;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListFinanceReportRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['enterprise_no'])) {
            $model->enterpriseNo = $map['enterprise_no'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['compare_year'])) {
            $model->compareYear = $map['compare_year'];
        }
        if (isset($map['base_year'])) {
            $model->baseYear = $map['base_year'];
        }

        return $model;
    }
}
