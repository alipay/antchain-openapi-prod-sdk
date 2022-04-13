<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PushFlowRouteclientRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 流量类型
    // NORMAL：正常流量
    // PRESS：压测流量
    /**
     * @var string
     */
    public $flowType;

    // 异构机房列表
    /**
     * @var string[]
     */
    public $isomerismSites;

    // 操作人
    /**
     * @var string
     */
    public $operatorName;

    // 推送类型
    // DRM：DRM推送
    // JMX：JMX推送
    // SPANNER：SPANNER推送
    /**
     * @var string
     */
    public $pushType;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceGroup;

    // 部署单元组的流量规则
    /**
     * @var UnitFlow[]
     */
    public $unitFlows;
    protected $_name = [
        'authToken'      => 'auth_token',
        'flowType'       => 'flow_type',
        'isomerismSites' => 'isomerism_sites',
        'operatorName'   => 'operator_name',
        'pushType'       => 'push_type',
        'workspaceGroup' => 'workspace_group',
        'unitFlows'      => 'unit_flows',
    ];

    public function validate()
    {
        Model::validateRequired('flowType', $this->flowType, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('pushType', $this->pushType, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('unitFlows', $this->unitFlows, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->flowType) {
            $res['flow_type'] = $this->flowType;
        }
        if (null !== $this->isomerismSites) {
            $res['isomerism_sites'] = $this->isomerismSites;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->pushType) {
            $res['push_type'] = $this->pushType;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->unitFlows) {
            $res['unit_flows'] = [];
            if (null !== $this->unitFlows && \is_array($this->unitFlows)) {
                $n = 0;
                foreach ($this->unitFlows as $item) {
                    $res['unit_flows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushFlowRouteclientRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['flow_type'])) {
            $model->flowType = $map['flow_type'];
        }
        if (isset($map['isomerism_sites'])) {
            if (!empty($map['isomerism_sites'])) {
                $model->isomerismSites = $map['isomerism_sites'];
            }
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['push_type'])) {
            $model->pushType = $map['push_type'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['unit_flows'])) {
            if (!empty($map['unit_flows'])) {
                $model->unitFlows = [];
                $n                = 0;
                foreach ($map['unit_flows'] as $item) {
                    $model->unitFlows[$n++] = null !== $item ? UnitFlow::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
