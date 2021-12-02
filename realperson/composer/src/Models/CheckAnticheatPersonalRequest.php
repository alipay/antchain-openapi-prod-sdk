<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CheckAnticheatPersonalRequest extends Model
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

    // 外部请求id
    /**
     * @var string
     */
    public $outerOrderNo;

    // 主体姓名
    /**
     * @var string
     */
    public $certName;

    // 主体身份证号
    /**
     * @var string
     */
    public $certNo;

    // 受雇企业
    /**
     * @var string
     */
    public $companyName;

    // 组织机构代码
    /**
     * @var string
     */
    public $companyNo;

    // 扩展字段，json格式
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'companyName'       => 'company_name',
        'companyNo'         => 'company_no',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('companyName', $this->companyName, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyNo) {
            $res['company_no'] = $this->companyNo;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAnticheatPersonalRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['company_no'])) {
            $model->companyNo = $map['company_no'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
