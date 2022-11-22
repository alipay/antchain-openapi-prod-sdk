<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class VerifyFacevrfZimRequest extends Model
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

    // 扩展信息,Map的json格式
    /**
     * @var string
     */
    public $externParam;

    // 人脸业务参数
    /**
     * @var string
     */
    public $zimData;

    // 7501f6c2dd57e06fe0d4202d3aaab58e
    /**
     * @var string
     */
    public $zimId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externParam'       => 'extern_param',
        'zimData'           => 'zim_data',
        'zimId'             => 'zim_id',
    ];

    public function validate()
    {
        Model::validateRequired('zimData', $this->zimData, true);
        Model::validateRequired('zimId', $this->zimId, true);
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
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->zimData) {
            $res['zim_data'] = $this->zimData;
        }
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyFacevrfZimRequest
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
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['zim_data'])) {
            $model->zimData = $map['zim_data'];
        }
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }

        return $model;
    }
}
