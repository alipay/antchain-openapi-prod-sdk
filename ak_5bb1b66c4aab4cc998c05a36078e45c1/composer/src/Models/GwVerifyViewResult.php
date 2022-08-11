<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class GwVerifyViewResult extends Model
{
    // 核身上下文id
    /**
     * @example xx
     *
     * @var string
     */
    public $verifyId;

    // 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
    /**
     * @example ZK_FACE_VERIFY
     *
     * @var string
     */
    public $productCode;

    // 核身分组
    /**
     * @example PC
     *
     * @var string
     */
    public $group;

    // 返回结果
    /**
     * @example
     *
     * @var NameValuePair[]
     */
    public $responseParams;

    // 核身渲染是否调用成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 返回码
    /**
     * @example xxx
     *
     * @var string
     */
    public $resultCode;

    // 返回信息
    /**
     * @example xxx
     *
     * @var string
     */
    public $resultMsg;
    protected $_name = [
        'verifyId'       => 'verify_id',
        'productCode'    => 'product_code',
        'group'          => 'group',
        'responseParams' => 'response_params',
        'success'        => 'success',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
    ];

    public function validate()
    {
        Model::validateRequired('verifyId', $this->verifyId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('responseParams', $this->responseParams, true);
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->responseParams) {
            $res['response_params'] = [];
            if (null !== $this->responseParams && \is_array($this->responseParams)) {
                $n = 0;
                foreach ($this->responseParams as $item) {
                    $res['response_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GwVerifyViewResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['response_params'])) {
            if (!empty($map['response_params'])) {
                $model->responseParams = [];
                $n                     = 0;
                foreach ($map['response_params'] as $item) {
                    $model->responseParams[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }

        return $model;
    }
}
