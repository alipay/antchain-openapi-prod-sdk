<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CountPlanStateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'gmtCreateEnd' => 'gmt_create_end',
        'gmtCreateStart' => 'gmt_create_start',
        'initialByTag' => 'initial_by_tag',
        'name' => 'name',
        'opsModes' => 'ops_modes',
        'opsTypes' => 'ops_types',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'planIds' => 'plan_ids',
        'planTimeSerialsId' => 'plan_time_serials_id',
        'releaseModes' => 'release_modes',
        'serviceName' => 'service_name',
        'states' => 'states',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validatePattern('gmtCreateEnd', $this->gmtCreateEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtCreateStart', $this->gmtCreateStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->gmtCreateEnd) {
            $res['gmt_create_end'] = $this->gmtCreateEnd;
        }
        if (null !== $this->gmtCreateStart) {
            $res['gmt_create_start'] = $this->gmtCreateStart;
        }
        if (null !== $this->initialByTag) {
            $res['initial_by_tag'] = $this->initialByTag;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->opsModes) {
            $res['ops_modes'] = $this->opsModes;
        }
        if (null !== $this->opsTypes) {
            $res['ops_types'] = $this->opsTypes;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->planIds) {
            $res['plan_ids'] = $this->planIds;
        }
        if (null !== $this->planTimeSerialsId) {
            $res['plan_time_serials_id'] = $this->planTimeSerialsId;
        }
        if (null !== $this->releaseModes) {
            $res['release_modes'] = $this->releaseModes;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->states) {
            $res['states'] = $this->states;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CountPlanStateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['gmt_create_end'])){
            $model->gmtCreateEnd = $map['gmt_create_end'];
        }
        if(isset($map['gmt_create_start'])){
            $model->gmtCreateStart = $map['gmt_create_start'];
        }
        if(isset($map['initial_by_tag'])){
            $model->initialByTag = $map['initial_by_tag'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['ops_modes'])){
            if(!empty($map['ops_modes'])){
                $model->opsModes = $map['ops_modes'];
            }
        }
        if(isset($map['ops_types'])){
            if(!empty($map['ops_types'])){
                $model->opsTypes = $map['ops_types'];
            }
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['plan_ids'])){
            if(!empty($map['plan_ids'])){
                $model->planIds = $map['plan_ids'];
            }
        }
        if(isset($map['plan_time_serials_id'])){
            $model->planTimeSerialsId = $map['plan_time_serials_id'];
        }
        if(isset($map['release_modes'])){
            if(!empty($map['release_modes'])){
                $model->releaseModes = $map['release_modes'];
            }
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        if(isset($map['states'])){
            if(!empty($map['states'])){
                $model->states = $map['states'];
            }
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

    // gmt_create_end
    /**
     * @var string
     */
    public $gmtCreateEnd;

    // gmtCreateStart
    /**
     * @var string
     */
    public $gmtCreateStart;

    // initial_by_tag
    /**
     * @var string
     */
    public $initialByTag;

    // name
    /**
     * @var string
     */
    public $name;

    // ops_modes
    /**
     * @var string[]
     */
    public $opsModes;

    // ops_types
    /**
     * @var string[]
     */
    public $opsTypes;

    // page no
    /**
     * @var int
     */
    public $pageNo;

    // page size
    /**
     * @var int
     */
    public $pageSize;

    // plan ids
    /**
     * @var string[]
     */
    public $planIds;

    // plan_time_serials_id
    /**
     * @var string
     */
    public $planTimeSerialsId;

    // release_modes
    /**
     * @var string[]
     */
    public $releaseModes;

    // service_name
    /**
     * @var string
     */
    public $serviceName;

    // states
    /**
     * @var string[]
     */
    public $states;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
