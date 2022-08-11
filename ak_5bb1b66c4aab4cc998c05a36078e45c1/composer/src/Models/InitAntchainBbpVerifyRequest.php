<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainBbpVerifyRequest extends Model
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

    // 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
    /**
     * @var GwVerifyScene
     */
    public $verifyScene;

    // 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
    /**
     * @var string
     */
    public $bizId;

    // 调用方传入，存放业务扩展参数（callback参数也写入此）
    /**
     * @var NameValuePair[]
     */
    public $externParams;

    // 调用方传入，指定核身完成后的回调类型
    /**
     * @var string
     */
    public $callbackEnum;

    // 核身产品列表
    /**
     * @var GwValidateProduct[]
     */
    public $validateFlows;

    // 核身id
    /**
     * @var string
     */
    public $verifyId;

    // 核身请求地址url
    /**
     * @var string
     */
    public $verifyUrl;

    // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
    /**
     * @var string
     */
    public $verifyStatus;

    // 可用产品集合
    /**
     * @var GwValidateProduct[]
     */
    public $validProd;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'verifyScene'       => 'verify_scene',
        'bizId'             => 'biz_id',
        'externParams'      => 'extern_params',
        'callbackEnum'      => 'callback_enum',
        'validateFlows'     => 'validate_flows',
        'verifyId'          => 'verify_id',
        'verifyUrl'         => 'verify_url',
        'verifyStatus'      => 'verify_status',
        'validProd'         => 'valid_prod',
    ];

    public function validate()
    {
        Model::validateRequired('verifyScene', $this->verifyScene, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('validateFlows', $this->validateFlows, true);
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
        if (null !== $this->verifyScene) {
            $res['verify_scene'] = null !== $this->verifyScene ? $this->verifyScene->toMap() : null;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->externParams) {
            $res['extern_params'] = [];
            if (null !== $this->externParams && \is_array($this->externParams)) {
                $n = 0;
                foreach ($this->externParams as $item) {
                    $res['extern_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->callbackEnum) {
            $res['callback_enum'] = $this->callbackEnum;
        }
        if (null !== $this->validateFlows) {
            $res['validate_flows'] = [];
            if (null !== $this->validateFlows && \is_array($this->validateFlows)) {
                $n = 0;
                foreach ($this->validateFlows as $item) {
                    $res['validate_flows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->verifyUrl) {
            $res['verify_url'] = $this->verifyUrl;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }
        if (null !== $this->validProd) {
            $res['valid_prod'] = [];
            if (null !== $this->validProd && \is_array($this->validProd)) {
                $n = 0;
                foreach ($this->validProd as $item) {
                    $res['valid_prod'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainBbpVerifyRequest
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
        if (isset($map['verify_scene'])) {
            $model->verifyScene = GwVerifyScene::fromMap($map['verify_scene']);
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['extern_params'])) {
            if (!empty($map['extern_params'])) {
                $model->externParams = [];
                $n                   = 0;
                foreach ($map['extern_params'] as $item) {
                    $model->externParams[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['callback_enum'])) {
            $model->callbackEnum = $map['callback_enum'];
        }
        if (isset($map['validate_flows'])) {
            if (!empty($map['validate_flows'])) {
                $model->validateFlows = [];
                $n                    = 0;
                foreach ($map['validate_flows'] as $item) {
                    $model->validateFlows[$n++] = null !== $item ? GwValidateProduct::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['verify_url'])) {
            $model->verifyUrl = $map['verify_url'];
        }
        if (isset($map['verify_status'])) {
            $model->verifyStatus = $map['verify_status'];
        }
        if (isset($map['valid_prod'])) {
            if (!empty($map['valid_prod'])) {
                $model->validProd = [];
                $n                = 0;
                foreach ($map['valid_prod'] as $item) {
                    $model->validProd[$n++] = null !== $item ? GwValidateProduct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
