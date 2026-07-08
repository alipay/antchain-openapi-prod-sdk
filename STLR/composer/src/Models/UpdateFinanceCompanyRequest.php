<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class UpdateFinanceCompanyRequest extends Model
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

    // 企业统一信用代码
    /**
     * @var string
     */
    public $companyId;

    // 企业或者项目名称
    /**
     * @var string
     */
    public $companyName;

    // 行业编码
    /**
     * @var string
     */
    public $industryCode;

    // 地区编码
    /**
     * @var string
     */
    public $areaCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseNo'      => 'enterprise_no',
        'companyId'         => 'company_id',
        'companyName'       => 'company_name',
        'industryCode'      => 'industry_code',
        'areaCode'          => 'area_code',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('industryCode', $this->industryCode, true);
        Model::validateRequired('areaCode', $this->areaCode, true);
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
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->industryCode) {
            $res['industry_code'] = $this->industryCode;
        }
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFinanceCompanyRequest
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
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['industry_code'])) {
            $model->industryCode = $map['industry_code'];
        }
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }

        return $model;
    }
}
