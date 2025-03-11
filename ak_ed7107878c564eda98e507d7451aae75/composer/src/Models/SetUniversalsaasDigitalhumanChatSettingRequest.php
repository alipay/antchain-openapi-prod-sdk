<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class SetUniversalsaasDigitalhumanChatSettingRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 交互配置ID
    /**
     * @var int
     */
    public $id;

    // 交互配置名
    /**
     * @var string
     */
    public $title;

    // 背景图片url
    /**
     * @var string
     */
    public $bgImg;

    // logo图片url
    /**
     * @var string
     */
    public $logoImg;

    // 气泡配置
    /**
     * @var AvatarBubbleInfo[]
     */
    public $bubbleConfig;

    // 自定义组件配置
    /**
     * @var AvatarComponentInfo[]
     */
    public $componentConfig;

    // 关联大模型对话配置编码
    /**
     * @var string
     */
    public $llmCode;

    // 关联知识库列表
    /**
     * @var int[]
     */
    public $libraryIds;

    // 话术配置
    /**
     * @var AvatarScriptConfigInfo
     */
    public $scriptConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'id'                => 'id',
        'title'             => 'title',
        'bgImg'             => 'bg_img',
        'logoImg'           => 'logo_img',
        'bubbleConfig'      => 'bubble_config',
        'componentConfig'   => 'component_config',
        'llmCode'           => 'llm_code',
        'libraryIds'        => 'library_ids',
        'scriptConfig'      => 'script_config',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->bgImg) {
            $res['bg_img'] = $this->bgImg;
        }
        if (null !== $this->logoImg) {
            $res['logo_img'] = $this->logoImg;
        }
        if (null !== $this->bubbleConfig) {
            $res['bubble_config'] = [];
            if (null !== $this->bubbleConfig && \is_array($this->bubbleConfig)) {
                $n = 0;
                foreach ($this->bubbleConfig as $item) {
                    $res['bubble_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->componentConfig) {
            $res['component_config'] = [];
            if (null !== $this->componentConfig && \is_array($this->componentConfig)) {
                $n = 0;
                foreach ($this->componentConfig as $item) {
                    $res['component_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->llmCode) {
            $res['llm_code'] = $this->llmCode;
        }
        if (null !== $this->libraryIds) {
            $res['library_ids'] = $this->libraryIds;
        }
        if (null !== $this->scriptConfig) {
            $res['script_config'] = null !== $this->scriptConfig ? $this->scriptConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetUniversalsaasDigitalhumanChatSettingRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['bg_img'])) {
            $model->bgImg = $map['bg_img'];
        }
        if (isset($map['logo_img'])) {
            $model->logoImg = $map['logo_img'];
        }
        if (isset($map['bubble_config'])) {
            if (!empty($map['bubble_config'])) {
                $model->bubbleConfig = [];
                $n                   = 0;
                foreach ($map['bubble_config'] as $item) {
                    $model->bubbleConfig[$n++] = null !== $item ? AvatarBubbleInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['component_config'])) {
            if (!empty($map['component_config'])) {
                $model->componentConfig = [];
                $n                      = 0;
                foreach ($map['component_config'] as $item) {
                    $model->componentConfig[$n++] = null !== $item ? AvatarComponentInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['llm_code'])) {
            $model->llmCode = $map['llm_code'];
        }
        if (isset($map['library_ids'])) {
            if (!empty($map['library_ids'])) {
                $model->libraryIds = $map['library_ids'];
            }
        }
        if (isset($map['script_config'])) {
            $model->scriptConfig = AvatarScriptConfigInfo::fromMap($map['script_config']);
        }

        return $model;
    }
}
