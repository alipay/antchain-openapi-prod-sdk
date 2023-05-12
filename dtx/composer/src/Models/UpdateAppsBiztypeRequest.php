<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class UpdateAppsBiztypeRequest extends Model
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

    // app_name
    /**
     * @var string
     */
    public $appName;

    // biz_type
    /**
     * @var string
     */
    public $bizType;

    // client_version
    /**
     * @var string
     */
    public $clientVersion;

    // id
    /**
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // is_asyn
    /**
     * @var bool
     */
    public $isAsyn;

    // is_load_test
    /**
     * @var bool
     */
    public $isLoadTest;

    // is_mix
    /**
     * @var bool
     */
    public $isMix;

    // participators
    /**
     * @var Participator[]
     */
    public $participators;

    // recovery_datasources
    /**
     * @var InitiatorDatasource[]
     */
    public $recoveryDatasources;

    // recovery_limit
    /**
     * @var int
     */
    public $recoveryLimit;

    // recovery_thread_num
    /**
     * @var int
     */
    public $recoveryThreadNum;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'appName'             => 'app_name',
        'bizType'             => 'biz_type',
        'clientVersion'       => 'client_version',
        'id'                  => 'id',
        'instanceId'          => 'instance_id',
        'isAsyn'              => 'is_asyn',
        'isLoadTest'          => 'is_load_test',
        'isMix'               => 'is_mix',
        'participators'       => 'participators',
        'recoveryDatasources' => 'recovery_datasources',
        'recoveryLimit'       => 'recovery_limit',
        'recoveryThreadNum'   => 'recovery_thread_num',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('clientVersion', $this->clientVersion, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isAsyn', $this->isAsyn, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('isMix', $this->isMix, true);
        Model::validateRequired('participators', $this->participators, true);
        Model::validateRequired('recoveryDatasources', $this->recoveryDatasources, true);
        Model::validateRequired('recoveryLimit', $this->recoveryLimit, true);
        Model::validateRequired('recoveryThreadNum', $this->recoveryThreadNum, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->clientVersion) {
            $res['client_version'] = $this->clientVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isAsyn) {
            $res['is_asyn'] = $this->isAsyn;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->isMix) {
            $res['is_mix'] = $this->isMix;
        }
        if (null !== $this->participators) {
            $res['participators'] = [];
            if (null !== $this->participators && \is_array($this->participators)) {
                $n = 0;
                foreach ($this->participators as $item) {
                    $res['participators'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoveryDatasources) {
            $res['recovery_datasources'] = [];
            if (null !== $this->recoveryDatasources && \is_array($this->recoveryDatasources)) {
                $n = 0;
                foreach ($this->recoveryDatasources as $item) {
                    $res['recovery_datasources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoveryLimit) {
            $res['recovery_limit'] = $this->recoveryLimit;
        }
        if (null !== $this->recoveryThreadNum) {
            $res['recovery_thread_num'] = $this->recoveryThreadNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAppsBiztypeRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['client_version'])) {
            $model->clientVersion = $map['client_version'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_asyn'])) {
            $model->isAsyn = $map['is_asyn'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['is_mix'])) {
            $model->isMix = $map['is_mix'];
        }
        if (isset($map['participators'])) {
            if (!empty($map['participators'])) {
                $model->participators = [];
                $n                    = 0;
                foreach ($map['participators'] as $item) {
                    $model->participators[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recovery_datasources'])) {
            if (!empty($map['recovery_datasources'])) {
                $model->recoveryDatasources = [];
                $n                          = 0;
                foreach ($map['recovery_datasources'] as $item) {
                    $model->recoveryDatasources[$n++] = null !== $item ? InitiatorDatasource::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recovery_limit'])) {
            $model->recoveryLimit = $map['recovery_limit'];
        }
        if (isset($map['recovery_thread_num'])) {
            $model->recoveryThreadNum = $map['recovery_thread_num'];
        }

        return $model;
    }
}
