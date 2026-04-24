<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AirDfSceneInfos extends Model
{
    // 决策场景结果
    /**
     * @example review
     *
     * @var string
     */
    public $sceneDecision;

    // 决策场景
    /**
     * @example air_scene
     *
     * @var string
     */
    public $sceneCode;

    // 决策域信息
    /**
     * @example [{"decision_flows":[{"decision":"review","name":"租赁测试策略"}],"domain_decision":"review","domain_code":"lease_domain"}]
     *
     * @var AirDomainInfos[]
     */
    public $domainInfos;
    protected $_name = [
        'sceneDecision' => 'scene_decision',
        'sceneCode'     => 'scene_code',
        'domainInfos'   => 'domain_infos',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneDecision) {
            $res['scene_decision'] = $this->sceneDecision;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->domainInfos) {
            $res['domain_infos'] = [];
            if (null !== $this->domainInfos && \is_array($this->domainInfos)) {
                $n = 0;
                foreach ($this->domainInfos as $item) {
                    $res['domain_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AirDfSceneInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_decision'])) {
            $model->sceneDecision = $map['scene_decision'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['domain_infos'])) {
            if (!empty($map['domain_infos'])) {
                $model->domainInfos = [];
                $n                  = 0;
                foreach ($map['domain_infos'] as $item) {
                    $model->domainInfos[$n++] = null !== $item ? AirDomainInfos::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
