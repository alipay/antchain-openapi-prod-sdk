<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseImportVO extends Model
{
    // iaas_id
    /**
     * @example iaas_id
     *
     * @var string
     */
    public $iaasId;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // engine
    /**
     * @example engine
     *
     * @var string
     */
    public $engine;

    // net_type
    /**
     * @example net_type
     *
     * @var string
     */
    public $netType;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // importInfo
    /**
     * @example
     *
     * @var ImportVO
     */
    public $importInfo;
    protected $_name = [
        'iaasId'      => 'iaas_id',
        'description' => 'description',
        'type'        => 'type',
        'status'      => 'status',
        'engine'      => 'engine',
        'netType'     => 'net_type',
        'utcCreate'   => 'utc_create',
        'importInfo'  => 'import_info',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('importInfo', $this->importInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->engine) {
            $res['engine'] = $this->engine;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->importInfo) {
            $res['import_info'] = null !== $this->importInfo ? $this->importInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseImportVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['engine'])) {
            $model->engine = $map['engine'];
        }
        if (isset($map['net_type'])) {
            $model->netType = $map['net_type'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['import_info'])) {
            $model->importInfo = ImportVO::fromMap($map['import_info']);
        }

        return $model;
    }
}
