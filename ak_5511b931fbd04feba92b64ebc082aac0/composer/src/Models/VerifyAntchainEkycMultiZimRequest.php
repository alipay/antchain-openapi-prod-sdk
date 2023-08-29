<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models;

use AlibabaCloud\Tea\Model;

class VerifyAntchainEkycMultiZimRequest extends Model
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

    // 实人认证id
    /**
     * @var string
     */
    public $certifyId;

    // zim_data可通过oss方式中转
    /**
     * @var string
     */
    public $zimDataOssObj;

    // 产品类型
    /**
     * @var string
     */
    public $productType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externParam'       => 'extern_param',
        'zimData'           => 'zim_data',
        'certifyId'         => 'certify_id',
        'zimDataOssObj'     => 'zim_data_oss_obj',
        'productType'       => 'product_type',
    ];

    public function validate()
    {
        Model::validateRequired('zimData', $this->zimData, true);
        Model::validateRequired('certifyId', $this->certifyId, true);
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->zimDataOssObj) {
            $res['zim_data_oss_obj'] = $this->zimDataOssObj;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAntchainEkycMultiZimRequest
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['zim_data_oss_obj'])) {
            $model->zimDataOssObj = $map['zim_data_oss_obj'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }

        return $model;
    }
}
