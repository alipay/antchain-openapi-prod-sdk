<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class CreateShortmsgTemplateRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 唯一请求id
    /**
     * @var string
     */
    public $requestUniqueId;

    // 短信签名名称，不需要带着【】
    /**
     * @var string
     */
    public $signName;

    // 短信内容
    /**
     * @var string
     */
    public $content;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;

    // 校验传入的参数是否有变量
    /**
     * @var bool
     */
    public $variableTemplate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'requestUniqueId'   => 'request_unique_id',
        'signName'          => 'sign_name',
        'content'           => 'content',
        'extInfo'           => 'ext_info',
        'variableTemplate'  => 'variable_template',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
        Model::validateRequired('signName', $this->signName, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('variableTemplate', $this->variableTemplate, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->signName) {
            $res['sign_name'] = $this->signName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->variableTemplate) {
            $res['variable_template'] = $this->variableTemplate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateShortmsgTemplateRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['sign_name'])) {
            $model->signName = $map['sign_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['variable_template'])) {
            $model->variableTemplate = $map['variable_template'];
        }

        return $model;
    }
}
