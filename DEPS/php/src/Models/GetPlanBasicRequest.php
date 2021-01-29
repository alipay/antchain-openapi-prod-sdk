<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetPlanBasicRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'showBasic' => 'show_basic',
        'timeSeriesId' => 'time_series_id',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('timeSeriesId', $this->timeSeriesId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->showBasic) {
            $res['show_basic'] = $this->showBasic;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetPlanBasicRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['show_basic'])){
            $model->showBasic = $map['show_basic'];
        }
        if(isset($map['time_series_id'])){
            $model->timeSeriesId = $map['time_series_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
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

    // show_basic
    /**
     * @var bool
     */
    public $showBasic;

    // time_series_id
    /**
     * @var string
     */
    public $timeSeriesId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
