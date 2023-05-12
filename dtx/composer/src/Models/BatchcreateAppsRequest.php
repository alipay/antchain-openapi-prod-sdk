<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateAppsRequest extends Model
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

    // 参与者数组
    /**
     * @var Participator[]
     */
    public $actionArray;

    // 1 同库； 2 异库
    /**
     * @var int
     */
    public $activityMode;

    // app
    /**
     * @var string
     */
    public $appName;

    // Hash
    /**
     * @var string
     */
    public $dbRuleName;

    // xxx
    /**
     * @var string
     */
    public $dbRuleTemplete;

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 编辑时传
    /**
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 发起方信息
    /**
     * @var RecoveryDTO[]
     */
    public $recoveryArray;

    // 数据源数组
    /**
     * @var RecoveryDsDTO[]
     */
    public $recoveryDsArray;

    // hash
    /**
     * @var string
     */
    public $tableRuleName;

    // xxx
    /**
     * @var string
     */
    public $tableRuleTemplete;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionArray'       => 'action_array',
        'activityMode'      => 'activity_mode',
        'appName'           => 'app_name',
        'dbRuleName'        => 'db_rule_name',
        'dbRuleTemplete'    => 'db_rule_templete',
        'desc'              => 'desc',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'recoveryArray'     => 'recovery_array',
        'recoveryDsArray'   => 'recovery_ds_array',
        'tableRuleName'     => 'table_rule_name',
        'tableRuleTemplete' => 'table_rule_templete',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->actionArray) {
            $res['action_array'] = [];
            if (null !== $this->actionArray && \is_array($this->actionArray)) {
                $n = 0;
                foreach ($this->actionArray as $item) {
                    $res['action_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dbRuleName) {
            $res['db_rule_name'] = $this->dbRuleName;
        }
        if (null !== $this->dbRuleTemplete) {
            $res['db_rule_templete'] = $this->dbRuleTemplete;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->recoveryArray) {
            $res['recovery_array'] = [];
            if (null !== $this->recoveryArray && \is_array($this->recoveryArray)) {
                $n = 0;
                foreach ($this->recoveryArray as $item) {
                    $res['recovery_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoveryDsArray) {
            $res['recovery_ds_array'] = [];
            if (null !== $this->recoveryDsArray && \is_array($this->recoveryDsArray)) {
                $n = 0;
                foreach ($this->recoveryDsArray as $item) {
                    $res['recovery_ds_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tableRuleName) {
            $res['table_rule_name'] = $this->tableRuleName;
        }
        if (null !== $this->tableRuleTemplete) {
            $res['table_rule_templete'] = $this->tableRuleTemplete;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateAppsRequest
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
        if (isset($map['action_array'])) {
            if (!empty($map['action_array'])) {
                $model->actionArray = [];
                $n                  = 0;
                foreach ($map['action_array'] as $item) {
                    $model->actionArray[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['db_rule_name'])) {
            $model->dbRuleName = $map['db_rule_name'];
        }
        if (isset($map['db_rule_templete'])) {
            $model->dbRuleTemplete = $map['db_rule_templete'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['recovery_array'])) {
            if (!empty($map['recovery_array'])) {
                $model->recoveryArray = [];
                $n                    = 0;
                foreach ($map['recovery_array'] as $item) {
                    $model->recoveryArray[$n++] = null !== $item ? RecoveryDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recovery_ds_array'])) {
            if (!empty($map['recovery_ds_array'])) {
                $model->recoveryDsArray = [];
                $n                      = 0;
                foreach ($map['recovery_ds_array'] as $item) {
                    $model->recoveryDsArray[$n++] = null !== $item ? RecoveryDsDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['table_rule_name'])) {
            $model->tableRuleName = $map['table_rule_name'];
        }
        if (isset($map['table_rule_templete'])) {
            $model->tableRuleTemplete = $map['table_rule_templete'];
        }

        return $model;
    }
}
