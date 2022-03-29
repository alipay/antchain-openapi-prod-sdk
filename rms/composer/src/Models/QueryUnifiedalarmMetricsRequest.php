<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmMetricsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 告警规则唯一标识
    /**
     * @var string
     */
    public $ruleUniqueIdentity;

    // metrics查询唯一id
    /**
     * @var string
     */
    public $muid;

    // 维度筛选
    /**
     * @var KeySet[]
     */
    public $tags;

    // 开始时间
    /**
     * @var int
     */
    public $start;

    // 结束时间
    /**
     * @var int
     */
    public $end;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'ruleUniqueIdentity' => 'rule_unique_identity',
        'muid'               => 'muid',
        'tags'               => 'tags',
        'start'              => 'start',
        'end'                => 'end',
        'workspaceName'      => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->ruleUniqueIdentity) {
            $res['rule_unique_identity'] = $this->ruleUniqueIdentity;
        }
        if (null !== $this->muid) {
            $res['muid'] = $this->muid;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmMetricsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['rule_unique_identity'])) {
            $model->ruleUniqueIdentity = $map['rule_unique_identity'];
        }
        if (isset($map['muid'])) {
            $model->muid = $map['muid'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
