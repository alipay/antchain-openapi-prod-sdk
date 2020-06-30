<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryOrganizationCertRequest extends Model {
    protected $_name = [
        'end' => 'end',
        'orgDid' => 'org_did',
        'start' => 'start',
    ];
    public function validate() {
        Model::validatePattern('end', $this->end, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('start', $this->start, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
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
     * @return QueryOrganizationCertRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 查询结束时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $end;

    /**
     * @description 企业id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    /**
     * @description 开始时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $start;

}
