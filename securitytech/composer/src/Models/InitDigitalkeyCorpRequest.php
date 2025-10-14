<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class InitDigitalkeyCorpRequest extends Model
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

    // 客户code
    /**
     * @var string
     */
    public $corpCode;

    // 客户名称
    /**
     * @var string
     */
    public $corpName;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 商户pid
    /**
     * @var string
     */
    public $pid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpCode'          => 'corp_code',
        'corpName'          => 'corp_name',
        'productCode'       => 'product_code',
        'pid'               => 'pid',
    ];

    public function validate()
    {
        Model::validateRequired('corpCode', $this->corpCode, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->corpCode) {
            $res['corp_code'] = $this->corpCode;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDigitalkeyCorpRequest
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
        if (isset($map['corp_code'])) {
            $model->corpCode = $map['corp_code'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }

        return $model;
    }
}
