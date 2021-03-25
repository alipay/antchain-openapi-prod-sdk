<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryServiceRollbackversionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'depth' => 'depth',
        'gmtCreateEnd' => 'gmt_create_end',
        'gmtCreateStart' => 'gmt_create_start',
        'ids' => 'ids',
        'name' => 'name',
        'opsTypes' => 'ops_types',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'processDefinitionId' => 'process_definition_id',
        'serviceGroupCollectionId' => 'service_group_collection_id',
        'servicePaasId' => 'service_paas_id',
        'state' => 'state',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validatePattern('gmtCreateEnd', $this->gmtCreateEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtCreateStart', $this->gmtCreateStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateRequired('processDefinitionId', $this->processDefinitionId, true);
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
        if (null !== $this->depth) {
            $res['depth'] = $this->depth;
        }
        if (null !== $this->gmtCreateEnd) {
            $res['gmt_create_end'] = $this->gmtCreateEnd;
        }
        if (null !== $this->gmtCreateStart) {
            $res['gmt_create_start'] = $this->gmtCreateStart;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->serviceGroupCollectionId) {
            $res['service_group_collection_id'] = $this->serviceGroupCollectionId;
        }
        if (null !== $this->servicePaasId) {
            $res['service_paas_id'] = $this->servicePaasId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryServiceRollbackversionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['depth'])){
            $model->depth = $map['depth'];
        }
        if(isset($map['gmt_create_end'])){
            $model->gmtCreateEnd = $map['gmt_create_end'];
        }
        if(isset($map['gmt_create_start'])){
            $model->gmtCreateStart = $map['gmt_create_start'];
        }
        if(isset($map['ids'])){
            if(!empty($map['ids'])){
                $model->ids = $map['ids'];
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
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
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
        }
        if(isset($map['service_group_collection_id'])){
            $model->serviceGroupCollectionId = $map['service_group_collection_id'];
        }
        if(isset($map['service_paas_id'])){
            $model->servicePaasId = $map['service_paas_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
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

    // depth
    /**
     * @var int
     */
    public $depth;

    // gmt_create_end
    /**
     * @var string
     */
    public $gmtCreateEnd;

    // gmt_create_start
    /**
     * @var string
     */
    public $gmtCreateStart;

    // ids
    /**
     * @var string[]
     */
    public $ids;

    // name
    /**
     * @var string
     */
    public $name;

    // ops_types
    /**
     * @var string[]
     */
    public $opsTypes;

    // page_no
    /**
     * @var int
     */
    public $pageNo;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // process_definition_id
    /**
     * @var string
     */
    public $processDefinitionId;

    // service_group_collection_id
    /**
     * @var string
     */
    public $serviceGroupCollectionId;

    // service_paas_id
    /**
     * @var string
     */
    public $servicePaasId;

    // state
    /**
     * @var string
     */
    public $state;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
