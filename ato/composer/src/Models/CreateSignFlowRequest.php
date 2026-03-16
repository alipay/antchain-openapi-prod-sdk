<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateSignFlowRequest extends Model
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

    // 用户协议
    /**
     * @var string
     */
    public $signFlowTitle;

    // 签署有效期毫秒时间戳，不传默认7天有效期
    /**
     * @var int
     */
    public $signValidity;

    // 签署完成后的跳转链接
    /**
     * @var string
     */
    public $redirectUrl;

    // 业务id，可以是订单id或其他业务id
    /**
     * @var string
     */
    public $businessId;

    // 签署业务场景
    /**
     * @var string
     */
    public $businessScene;

    // 签署人列表
    /**
     * @var SignAccount[]
     */
    public $signAccountList;

    // 签署模板列表
    /**
     * @var TemplateInfo[]
     */
    public $templateInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signFlowTitle'     => 'sign_flow_title',
        'signValidity'      => 'sign_validity',
        'redirectUrl'       => 'redirect_url',
        'businessId'        => 'business_id',
        'businessScene'     => 'business_scene',
        'signAccountList'   => 'sign_account_list',
        'templateInfoList'  => 'template_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('signFlowTitle', $this->signFlowTitle, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('signAccountList', $this->signAccountList, true);
        Model::validateRequired('templateInfoList', $this->templateInfoList, true);
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
        if (null !== $this->signFlowTitle) {
            $res['sign_flow_title'] = $this->signFlowTitle;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->signAccountList) {
            $res['sign_account_list'] = [];
            if (null !== $this->signAccountList && \is_array($this->signAccountList)) {
                $n = 0;
                foreach ($this->signAccountList as $item) {
                    $res['sign_account_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->templateInfoList) {
            $res['template_info_list'] = [];
            if (null !== $this->templateInfoList && \is_array($this->templateInfoList)) {
                $n = 0;
                foreach ($this->templateInfoList as $item) {
                    $res['template_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSignFlowRequest
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
        if (isset($map['sign_flow_title'])) {
            $model->signFlowTitle = $map['sign_flow_title'];
        }
        if (isset($map['sign_validity'])) {
            $model->signValidity = $map['sign_validity'];
        }
        if (isset($map['redirect_url'])) {
            $model->redirectUrl = $map['redirect_url'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['sign_account_list'])) {
            if (!empty($map['sign_account_list'])) {
                $model->signAccountList = [];
                $n                      = 0;
                foreach ($map['sign_account_list'] as $item) {
                    $model->signAccountList[$n++] = null !== $item ? SignAccount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['template_info_list'])) {
            if (!empty($map['template_info_list'])) {
                $model->templateInfoList = [];
                $n                       = 0;
                foreach ($map['template_info_list'] as $item) {
                    $model->templateInfoList[$n++] = null !== $item ? TemplateInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
