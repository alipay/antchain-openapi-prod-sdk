<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateBuildpackUpdatepackagesstatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'id' => 'id',
        'newFileStatus' => 'new_file_status',
        'originalFileStatus' => 'original_file_status',
        'regionNum' => 'region_num',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->newFileStatus) {
            $res['new_file_status'] = $this->newFileStatus;
        }
        if (null !== $this->originalFileStatus) {
            $res['original_file_status'] = $this->originalFileStatus;
        }
        if (null !== $this->regionNum) {
            $res['region_num'] = $this->regionNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBuildpackUpdatepackagesstatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['new_file_status'])){
            $model->newFileStatus = $map['new_file_status'];
        }
        if(isset($map['original_file_status'])){
            $model->originalFileStatus = $map['original_file_status'];
        }
        if(isset($map['region_num'])){
            if(!empty($map['region_num'])){
                $model->regionNum = $map['region_num'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // buildpackId
    /**
     * @var string
     */
    public $id;

    // newFileStatus
    /**
     * @var string
     */
    public $newFileStatus;

    // originalFileStatus
    /**
     * @var string
     */
    public $originalFileStatus;

    // regionIds
    /**
     * @var string[]
     */
    public $regionNum;

}
