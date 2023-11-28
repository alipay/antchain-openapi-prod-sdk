<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e94e2404d4b449ba90e0886673004f6b\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudTapchainprodDataproducttemplateApiRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 接口模板编码，用于标识接口参数模板
    /**
     * @var string
     */
    public $templateId;

    // 请求参数，json参数，根据不同模板入参数定义。
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'  => 'auth_token',
        'templateId' => 'template_id',
        'bizContent' => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntcloudTapchainprodDataproducttemplateApiRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
