<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsActionWithCommand extends Model
{
    // 动作类型
    /**
     * @example DISABLE_SLB_TRAFFIC
     *
     * @var string
     */
    public $actionType;

    // ops_command
    /**
     * @example {}
     *
     * @var OpsCommand
     */
    public $opsCommand;

    // command_template_id
    /**
     * @example 0000001
     *
     * @var string
     */
    public $commandTemplateId;

    // origin_params_definition
    /**
     * @example test
     *
     * @var string
     */
    public $originParamsDefinition;
    protected $_name = [
        'actionType'             => 'action_type',
        'opsCommand'             => 'ops_command',
        'commandTemplateId'      => 'command_template_id',
        'originParamsDefinition' => 'origin_params_definition',
    ];

    public function validate()
    {
        Model::validateRequired('actionType', $this->actionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->opsCommand) {
            $res['ops_command'] = null !== $this->opsCommand ? $this->opsCommand->toMap() : null;
        }
        if (null !== $this->commandTemplateId) {
            $res['command_template_id'] = $this->commandTemplateId;
        }
        if (null !== $this->originParamsDefinition) {
            $res['origin_params_definition'] = $this->originParamsDefinition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsActionWithCommand
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['ops_command'])) {
            $model->opsCommand = OpsCommand::fromMap($map['ops_command']);
        }
        if (isset($map['command_template_id'])) {
            $model->commandTemplateId = $map['command_template_id'];
        }
        if (isset($map['origin_params_definition'])) {
            $model->originParamsDefinition = $map['origin_params_definition'];
        }

        return $model;
    }
}
