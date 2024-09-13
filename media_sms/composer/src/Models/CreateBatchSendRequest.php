<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class CreateBatchSendRequest extends Model
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

    // 调用方群发任务id，不超过70个长度，用于幂等
    /**
     * @var string
     */
    public $massTaskId;

    // 模板id
    /**
     * @var string
     */
    public $templateId;

    // 变量值需要按模板定义时的变量顺序传递且个数需要对应上
    // 最⼤1000个组包
    /**
     * @var ContentSend[]
     */
    public $contentList;

    // 是否立即发送
    /**
     * @var bool
     */
    public $sendNow;

    // 立即发送时，该字段不消费
    /**
     * @var string
     */
    public $sendTime;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 拓展字段
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'massTaskId'        => 'mass_task_id',
        'templateId'        => 'template_id',
        'contentList'       => 'content_list',
        'sendNow'           => 'send_now',
        'sendTime'          => 'send_time',
        'tenantId'          => 'tenant_id',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('massTaskId', $this->massTaskId, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('contentList', $this->contentList, true);
        Model::validateRequired('sendNow', $this->sendNow, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->massTaskId) {
            $res['mass_task_id'] = $this->massTaskId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->contentList) {
            $res['content_list'] = [];
            if (null !== $this->contentList && \is_array($this->contentList)) {
                $n = 0;
                foreach ($this->contentList as $item) {
                    $res['content_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sendNow) {
            $res['send_now'] = $this->sendNow;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBatchSendRequest
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
        if (isset($map['mass_task_id'])) {
            $model->massTaskId = $map['mass_task_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['content_list'])) {
            if (!empty($map['content_list'])) {
                $model->contentList = [];
                $n                  = 0;
                foreach ($map['content_list'] as $item) {
                    $model->contentList[$n++] = null !== $item ? ContentSend::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['send_now'])) {
            $model->sendNow = $map['send_now'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
