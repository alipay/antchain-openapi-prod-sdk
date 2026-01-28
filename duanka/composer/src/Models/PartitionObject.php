<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class PartitionObject extends Model
{
    // tableGuid
    /**
     * @example tableGuid
     *
     * @var string
     */
    public $tableGuid;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // create_time
    /**
     * @example create_time
     *
     * @var string
     */
    public $createTime;

    // last_modify_time
    /**
     * @example last_modify_time
     *
     * @var string
     */
    public $lastModifyTime;

    // panguFileSize
    /**
     * @example 1
     *
     * @var int
     */
    public $panguFileSize;

    // recordCnt 记录数目
    /**
     * @example 1
     *
     * @var int
     */
    public $recordCnt;
    protected $_name = [
        'tableGuid'      => 'table_guid',
        'name'           => 'name',
        'createTime'     => 'create_time',
        'lastModifyTime' => 'last_modify_time',
        'panguFileSize'  => 'pangu_file_size',
        'recordCnt'      => 'record_cnt',
    ];

    public function validate()
    {
        Model::validateRequired('tableGuid', $this->tableGuid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('lastModifyTime', $this->lastModifyTime, true);
        Model::validateRequired('panguFileSize', $this->panguFileSize, true);
        Model::validateRequired('recordCnt', $this->recordCnt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tableGuid) {
            $res['table_guid'] = $this->tableGuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->lastModifyTime) {
            $res['last_modify_time'] = $this->lastModifyTime;
        }
        if (null !== $this->panguFileSize) {
            $res['pangu_file_size'] = $this->panguFileSize;
        }
        if (null !== $this->recordCnt) {
            $res['record_cnt'] = $this->recordCnt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartitionObject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['table_guid'])) {
            $model->tableGuid = $map['table_guid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['last_modify_time'])) {
            $model->lastModifyTime = $map['last_modify_time'];
        }
        if (isset($map['pangu_file_size'])) {
            $model->panguFileSize = $map['pangu_file_size'];
        }
        if (isset($map['record_cnt'])) {
            $model->recordCnt = $map['record_cnt'];
        }

        return $model;
    }
}
