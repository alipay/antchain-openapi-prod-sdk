<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class IpFileOs extends Model {
    protected $_name = [
        'errorMsg' => 'error_msg',
        'ip' => 'ip',
        'nextFileId' => 'next_file_id',
        'nextOffset' => 'next_offset',
        'uuid' => 'uuid',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->nextFileId) {
            $res['next_file_id'] = $this->nextFileId;
        }
        if (null !== $this->nextOffset) {
            $res['next_offset'] = $this->nextOffset;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IpFileOs
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['error_msg'])){
            $model->errorMsg = $map['error_msg'];
        }
        if(isset($map['ip'])){
            $model->ip = $map['ip'];
        }
        if(isset($map['next_file_id'])){
            $model->nextFileId = $map['next_file_id'];
        }
        if(isset($map['next_offset'])){
            $model->nextOffset = $map['next_offset'];
        }
        if(isset($map['uuid'])){
            $model->uuid = $map['uuid'];
        }
        return $model;
    }
    // error_msg
    /**
     * @example error_msg
     * @var string
     */
    public $errorMsg;

    // ip
    /**
     * @example ip
     * @var string
     */
    public $ip;

    // next_file_id
    /**
     * @example next_file_id
     * @var string
     */
    public $nextFileId;

    // next_offset
    /**
     * @example next_offset
     * @var int
     */
    public $nextOffset;

    // uuid
    /**
     * @example uuid
     * @var string
     */
    public $uuid;

}
