<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasEbcOrganizationCertRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'end' => 'end',
        'orgDid' => 'org_did',
        'start' => 'start',
    ];
    public function validate() {
        Model::validatePattern('end', $this->end, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('start', $this->start, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasEbcOrganizationCertRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['end'])){
            $model->end = $map['end'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['start'])){
            $model->start = $map['start'];
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
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 查询结束时间
    /**
     * @var string
     */
    public $end;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 开始时间
    /**
     * @var string
     */
    public $start;

}
