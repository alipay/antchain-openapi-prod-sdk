<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendSecurityDataRequest extends Model
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

    // 安全累计属性列表字段，安全属性列表
    /**
     * @var string
     */
    public $securityContent;

    // 代码发送给安全核心的事件编码
    /**
     * @var string
     */
    public $securitySign;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'securityContent'   => 'security_content',
        'securitySign'      => 'security_sign',
    ];

    public function validate()
    {
        Model::validateRequired('securityContent', $this->securityContent, true);
        Model::validateRequired('securitySign', $this->securitySign, true);
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
        if (null !== $this->securityContent) {
            $res['security_content'] = $this->securityContent;
        }
        if (null !== $this->securitySign) {
            $res['security_sign'] = $this->securitySign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendSecurityDataRequest
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
        if (isset($map['security_content'])) {
            $model->securityContent = $map['security_content'];
        }
        if (isset($map['security_sign'])) {
            $model->securitySign = $map['security_sign'];
        }

        return $model;
    }
}
