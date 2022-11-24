<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class SpProvider extends Model
{
    // 供应商编号
    /**
     * @example S0001
     *
     * @var string
     */
    public $supCode;

    // 供应商名称
    /**
     * @example 供应商A
     *
     * @var string
     */
    public $supName;

    // 文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $fileName;

    // 文件code
    /**
     * @example 外包协议-1614838961
     *
     * @var string
     */
    public $fileCode;

    // hash的值
    /**
     * @example 80asd4515efd54gr4aw124d
     *
     * @var string
     */
    public $hashCode;

    // 开始时间
    /**
     * @example 2021-03-17
     *
     * @var string
     */
    public $startDate;

    // 结束日期
    /**
     * @example 2022-03-17
     *
     * @var string
     */
    public $closingDate;

    // 文件路径
    /**
     * @example G:/foder2
     *
     * @var string
     */
    public $filePath;

    // 2021-03-04 11:16:23
    /**
     * @example 创建时间
     *
     * @var string
     */
    public $createDate;

    // 创建者
    /**
     * @example 管理员
     *
     * @var string
     */
    public $creator;
    protected $_name = [
        'supCode'     => 'sup_code',
        'supName'     => 'sup_name',
        'fileName'    => 'file_name',
        'fileCode'    => 'file_code',
        'hashCode'    => 'hash_code',
        'startDate'   => 'start_date',
        'closingDate' => 'closing_date',
        'filePath'    => 'file_path',
        'createDate'  => 'create_date',
        'creator'     => 'creator',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('supName', $this->supName, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileCode', $this->fileCode, true);
        Model::validateRequired('hashCode', $this->hashCode, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('closingDate', $this->closingDate, true);
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('createDate', $this->createDate, true);
        Model::validateRequired('creator', $this->creator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }
        if (null !== $this->supName) {
            $res['sup_name'] = $this->supName;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileCode) {
            $res['file_code'] = $this->fileCode;
        }
        if (null !== $this->hashCode) {
            $res['hash_code'] = $this->hashCode;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->closingDate) {
            $res['closing_date'] = $this->closingDate;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SpProvider
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }
        if (isset($map['sup_name'])) {
            $model->supName = $map['sup_name'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_code'])) {
            $model->fileCode = $map['file_code'];
        }
        if (isset($map['hash_code'])) {
            $model->hashCode = $map['hash_code'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['closing_date'])) {
            $model->closingDate = $map['closing_date'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['create_date'])) {
            $model->createDate = $map['create_date'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }

        return $model;
    }
}
