<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DeleteFinanceCompanyRequest extends Model
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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseNo'      => 'enterprise_no',
        'companyId'         => 'company_id',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseNo', $this->enterpriseNo, true);
        Model::validateRequired('companyId', $this->companyId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteFinanceCompanyRequest
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

        return $model;
    }
}
