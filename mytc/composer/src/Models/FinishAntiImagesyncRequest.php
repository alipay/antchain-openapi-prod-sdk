<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class FinishAntiImagesyncRequest extends Model
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

    // 批次号
    /**
     * @var string
     */
    public $batchNo;

    // 防伪码类型
    /**
     * @var string
     */
    public $codeType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchNo'           => 'batch_no',
        'codeType'          => 'code_type',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('codeType', $this->codeType, true);
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
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->codeType) {
            $res['code_type'] = $this->codeType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishAntiImagesyncRequest
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
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['code_type'])) {
            $model->codeType = $map['code_type'];
        }

        return $model;
    }
}
