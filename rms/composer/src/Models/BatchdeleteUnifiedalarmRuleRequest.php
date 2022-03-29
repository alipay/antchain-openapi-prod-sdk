<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchdeleteUnifiedalarmRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // id
    /**
     * @var int[]
     */
    public $idsRepeatList;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'idsRepeatList' => 'ids_repeat_list',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('idsRepeatList', $this->idsRepeatList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->idsRepeatList) {
            $res['ids_repeat_list'] = $this->idsRepeatList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchdeleteUnifiedalarmRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['ids_repeat_list'])) {
            if (!empty($map['ids_repeat_list'])) {
                $model->idsRepeatList = $map['ids_repeat_list'];
            }
        }

        return $model;
    }
}
