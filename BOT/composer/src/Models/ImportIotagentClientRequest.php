<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportIotagentClientRequest extends Model
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

    // 设备标识列表
    /**
     * @var string[]
     */
    public $uidList;

    // 实例Id
    /**
     * @var string
     */
    public $instanceId;

    // SKU名称
    /**
     * @var string
     */
    public $skuName;

    // 模版智能体ID
    /**
     * @var string
     */
    public $templateAgentId;

    // 智能体话题
    /**
     * @var string
     */
    public $agentTopic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uidList'           => 'uid_list',
        'instanceId'        => 'instance_id',
        'skuName'           => 'sku_name',
        'templateAgentId'   => 'template_agent_id',
        'agentTopic'        => 'agent_topic',
    ];

    public function validate()
    {
        Model::validateRequired('uidList', $this->uidList, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('templateAgentId', $this->templateAgentId, true);
        Model::validateRequired('agentTopic', $this->agentTopic, true);
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
        if (null !== $this->uidList) {
            $res['uid_list'] = $this->uidList;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->templateAgentId) {
            $res['template_agent_id'] = $this->templateAgentId;
        }
        if (null !== $this->agentTopic) {
            $res['agent_topic'] = $this->agentTopic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIotagentClientRequest
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
        if (isset($map['uid_list'])) {
            if (!empty($map['uid_list'])) {
                $model->uidList = $map['uid_list'];
            }
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['template_agent_id'])) {
            $model->templateAgentId = $map['template_agent_id'];
        }
        if (isset($map['agent_topic'])) {
            $model->agentTopic = $map['agent_topic'];
        }

        return $model;
    }
}
