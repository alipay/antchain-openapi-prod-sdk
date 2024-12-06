<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f9cb6523d99f4d089e97d549f141e6e4\Models;

use AlibabaCloud\Tea\Model;

class RunBlockchainTaxApiDataprocessRequest extends Model
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

    // 请求参数json
    /**
     * @var string
     */
    public $bizParam;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 调用的方法
    /**
     * @var string
     */
    public $methodCode;

    // 租户编码
    /**
     * @var string
     */
    public $instCode;

    // RSA-DESede
    // 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
    /**
     * @var string
     */
    public $algorithm;

    // 是否采用加密算法
    /**
     * @var bool
     */
    public $encryption;

    // 对称秘钥加密后的数据
    /**
     * @var string
     */
    public $encryptionKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizParam'          => 'biz_param',
        'productCode'       => 'product_code',
        'methodCode'        => 'method_code',
        'instCode'          => 'inst_code',
        'algorithm'         => 'algorithm',
        'encryption'        => 'encryption',
        'encryptionKey'     => 'encryption_key',
    ];

    public function validate()
    {
        Model::validateRequired('bizParam', $this->bizParam, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('methodCode', $this->methodCode, true);
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
        if (null !== $this->bizParam) {
            $res['biz_param'] = $this->bizParam;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->methodCode) {
            $res['method_code'] = $this->methodCode;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->algorithm) {
            $res['algorithm'] = $this->algorithm;
        }
        if (null !== $this->encryption) {
            $res['encryption'] = $this->encryption;
        }
        if (null !== $this->encryptionKey) {
            $res['encryption_key'] = $this->encryptionKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunBlockchainTaxApiDataprocessRequest
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
        if (isset($map['biz_param'])) {
            $model->bizParam = $map['biz_param'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['method_code'])) {
            $model->methodCode = $map['method_code'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['algorithm'])) {
            $model->algorithm = $map['algorithm'];
        }
        if (isset($map['encryption'])) {
            $model->encryption = $map['encryption'];
        }
        if (isset($map['encryption_key'])) {
            $model->encryptionKey = $map['encryption_key'];
        }

        return $model;
    }
}
