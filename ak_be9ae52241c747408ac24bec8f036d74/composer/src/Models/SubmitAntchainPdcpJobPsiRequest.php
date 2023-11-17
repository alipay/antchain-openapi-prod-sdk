<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class SubmitAntchainPdcpJobPsiRequest extends Model
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

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // 任务名称
    /**
     * @var string
     */
    public $name;

    // 任务类型，目前仅支持一种
    /**
     * @var string
     */
    public $type;

    // 任务的描述信息
    /**
     * @var string
     */
    public $description;

    // 任务执行参数，构造方式参考Participant结构体定义
    /**
     * @var PsiParticipantConfig[]
     */
    public $participantList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'name'              => 'name',
        'type'              => 'type',
        'description'       => 'description',
        'participantList'   => 'participant_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('participantList', $this->participantList, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->participantList) {
            $res['participant_list'] = [];
            if (null !== $this->participantList && \is_array($this->participantList)) {
                $n = 0;
                foreach ($this->participantList as $item) {
                    $res['participant_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAntchainPdcpJobPsiRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['participant_list'])) {
            if (!empty($map['participant_list'])) {
                $model->participantList = [];
                $n                      = 0;
                foreach ($map['participant_list'] as $item) {
                    $model->participantList[$n++] = null !== $item ? PsiParticipantConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
